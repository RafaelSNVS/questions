public class Question {

    private String origin;
    private int year;
    private int id;
    private String question;

    public void setOrigin(String origin){
        this.origin=origin;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setQuestion(String question){
        this.question=question;
    }

    private void setId(){
        //gerador de id apartir do banco
    }
}
