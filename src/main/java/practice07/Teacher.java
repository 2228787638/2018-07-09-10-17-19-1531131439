package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public String introduce(){
        if(this.klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach Class 2.";
    }

    public String introduceWith(Student student){
        if(this.getKlass().getNumber()==student.getKlass().getNumber()){
            return super.introduce()+" I am a Teacher. I teach Jerry.";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach Jerry.";
        }
    }
}

