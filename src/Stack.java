import java.util.ArrayList;

public class Stack extends Person{
    private ArrayList<Person> list = new ArrayList<>();
    String stack_name = "";

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }

    public void push(String name, Integer age, String gender, String occupation){
        list.add(new Person(name, age, gender, occupation));
    }

    public void push(String name, Integer age){
        list.add(new Person(name, age));
    }

    public void push(Person o){
        list.add(o);
    }

    public Person pop(){
        Person o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public Person peek(){
        return list.get(getSize() - 1);
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        if(list.isEmpty()){
            return "---" + this.stack_name + "----\n\nEmpty Stack\n";
        } else{
            String endString = "";

            endString += "----" + this.stack_name + "----\n\n";

            for(int i = list.size() - 1; i >= 0; i--){
                endString += i + " " + list.get(i).getName() + " " + list.get(i).getAge() + " " + list.get(i).getGender() + " ";

                if(list.get(i).isFrontliner()){
                    endString += " Frontliner";
                }else {
                    endString += " Not Frontliner";
                }

                if(i == 0){
                    endString += "";
                }else {
                    endString += "\n\n";
                }
            }
            return endString;
        }
    }

    public boolean search(Person o){
        return list.contains(o);
    }

    public void displayStack(){
        System.out.println(this.toString());
    }
}