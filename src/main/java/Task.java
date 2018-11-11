public class Task {

    private String id;
    private Boolean done;
    private String description;

    @Override
    public String toString(){
        return "Task [id=" + id +", done=" + done +", descricao=" + description + "]\n";

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return description  ;
    }
    public void setDescricao(String descricao) {
        this.description = descricao;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }

}

