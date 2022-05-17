public class main {

    public static void main(String[] args) {
        Stack raw = new Stack("Raw list");
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanaka",41);
        raw.push("ahmad",18,"m","developer");
        raw.push("maria",20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju",55,"m","police");
        raw.push("alex",16,"f","business man ");
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        raw.displayStack();

        Stack frontliners = new Stack("Frontliners");
        Stack others = new Stack("Others");

        while(raw.getSize() != 0){
            Person aPerson = raw.pop();
            if(aPerson.isFrontliner()){
                frontliners.push(aPerson);
            }else {
                others.push(aPerson);
            }
        }
        System.out.println("\n~~~~~~~Sort into frontliners and others~~~~~\n");
        raw.displayStack();
        System.out.print("-------------------");
        System.out.println("\n");
        frontliners.displayStack();
        System.out.println();
        System.out.print("-------------------");
        System.out.println("\n");
        others.displayStack();
        System.out.println("\n-------------------");

        System.out.println("\n~~~~~~~Sort into Vaccine list~~~~~\n");

        frontliners = sortStack(frontliners);
        others = sortStack(others);

        Stack vaccinePriorityList = new Stack("Vaccine Priority List");

        while (!others.isEmpty())
            vaccinePriorityList.push(others.pop());

        while (!frontliners.isEmpty())
            vaccinePriorityList.push(frontliners.pop());

        others.displayStack();
        System.out.print("-------------------\n\n");
        frontliners.displayStack();
        System.out.print("-------------------\n\n");
        vaccinePriorityList.displayStack();

    }

    // to sort the stack in ascending order
    public static Stack sortStack(Stack theStack){
        Stack tmpStack = new Stack("tmp stack");
        Stack terbalikStack = new Stack("terbalik stack");

        /**popping the tmpStack back onto the parsed stack will result in the stack being in ascending order
         * therefore, it will be required to pop back into the original stack to cause it back to descending
         * order
         **/

        while(!theStack.isEmpty()){
            Person tmpPerson = theStack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek().getAge() < tmpPerson.getAge()){
                theStack.push(tmpStack.pop());
            }
            tmpStack.push(tmpPerson);
        }

        while(!tmpStack.isEmpty()){
            terbalikStack.push(tmpStack.pop());
        }

        while(!terbalikStack.isEmpty()){
            theStack.push(terbalikStack.pop());
        }
        return theStack;
    }
}
