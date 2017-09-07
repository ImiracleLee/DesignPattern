package prototype;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) {
        try {
            this.workExperience = (WorkExperience) workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        workExperience.setWorkDate(timeArea);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println(workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    /**
     * 深克隆，调用私有构造方法克隆对象
     *
     * @return
     */
    @Override
    public Object clone() {
        Resume resume = new Resume(this.workExperience);
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }
}
