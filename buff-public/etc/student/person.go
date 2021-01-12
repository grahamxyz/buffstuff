package person

import . "fmt"

type IPerson interface {
	Name() string
	String() string
}

type Person struct {
	name string
	age int
}

func NewPerson(name string, age int) (p *Person) {
	p=new(Person)
	p.InitPerson(name,age)
	return
}

func (p *Person) InitPerson(name string, age int) {
	p.name=name
	p.age=age
}

func (p *Person) Name() string { return p.name }

func (p *Person) StringPerson() string {
	return p.name+" "+Sprintf("%d",p.age)
}
func (p *Person) String() string { return p.StringPerson() }
