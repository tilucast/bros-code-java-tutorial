package OOP;

public class PC {

    private String motherboard;
    private String processor;
    private String company;

    PC(String motherboard, String processor, String company){
        this.motherboard = motherboard;
        this.processor = processor;
        this.company = company;
    }

    PC(PC pc){
        this.copy(pc);
    }

    public String getMotherboard(){
        return motherboard;
    }

    public String getProcessor(){
        return processor;
    }

    public String getCompany(){
        return company;
    }

    public void setMotherboard(String motherboard){
        this.motherboard = motherboard;
    }

    public void setProcessor(String processor){
        this.processor = processor;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void copy(PC pc){
        this.setCompany(pc.getCompany());
        this.setMotherboard(pc.getMotherboard());
        this.setProcessor(pc.getProcessor());
    }
}
