SRC ?= src
DST ?= build/classes
MAIN ?= hanoi.Hanoi

clean:
	rm -f $$(find $(DST) -name *.class)

compile:
	mkdir -p $(DST)
	javac -cp $(SRC) -d $(DST) $$(find $(SRC) -name *.java)

run:
	java -cp $(DST) $(MAIN)
