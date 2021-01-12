prog:=main

%.pkg: %.go
	gccgo -fno-require-return-statement -g -c $(filter %.go,$^)

$(prog):
	gccgo -g -o $@ *.o

person.pkg:
main.pkg: person.pkg
$(prog): main.pkg

person.pkg: student.go

test: $(prog)
	./$^

clean:
	rm -f $(prog) *.o
