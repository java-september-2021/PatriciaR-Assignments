

class Project {
    private String name;
    private String desc;

    public Project(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public Project() {

    }

    public Project(String name) {
        this.name = name;
        
    }

    public void setName(String name1){
        name = name1;
    }

    public String getName(){
        return name;
    }

    public void setDesc(String desc1){
        desc = desc1;
    }

    public String getDesc(){
        return desc;
    }

    public String elevatorPitch(){
        
        return (name + ":" + desc);
    }
}