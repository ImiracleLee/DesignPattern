package prototype;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class WorkExperience implements Cloneable {
    private String workDate;

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    /**
     * 浅克隆，需要实现Cloneable接口，否则报CloneNotSupportedException
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
