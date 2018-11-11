import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Metodos {

    public void pegatudo(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);

        try {
            Call<List<Task>> call = api.getTask();

            Response<List<Task>> r = call.execute();

            List<Task> t = r.body();

            System.out.println(t);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    /*
    public void CriarTarefa() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);

        try {
            Task task = new Task();
            task.setDescricao("Estudar");
            task.setDone(false);
            Call<Task> call = api.createTask(task);

            Response<Task> r = call.execute();

            Task t = r.body();

            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();

    public void getTaskId() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);

        try {
            Call<Task> call = api.getTaskId("1361");

            Response<Task> r = call.execute();

            Task t = r.body();

            System.out.println(t);

        }catch(Exception e) {
            e.printStackTrace();

    public void updateTaskId() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);

        try {
            Task task = new Task();
            task.setDescricao("Vo ve e te aviso");
            task.setDone(false);

            Call<Void> call = api.updateTaskId(task, "1361");

            Response <Void> r = call.execute();

            if (r.isSuccessful()) {
                System.out.println("Tarefa Atualizada!");
            }
            else{
                System.out.println("Deu Errado, favor verificar ID digitada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/



}