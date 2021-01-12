package person

type IStudent interface {
	IPerson						// embedded interface: superclass
}

type Student struct {
	Person						// embedded struct: superclass
	major string
}

func NewStudent(name string, age int, major string) (s *Student) {
	s=new(Student)
	s.InitStudent(name,age,major)
	return
}

func (s *Student) InitStudent(name string, age int, major string) {
	s.InitPerson(name,age)		// superclass constructor
	s.major=major
}

func (s *Student) StringStudent() string {
	return s.StringPerson()+" "+s.major // super.String()
}
func (s *Student) String() string { return s.StringStudent() }
