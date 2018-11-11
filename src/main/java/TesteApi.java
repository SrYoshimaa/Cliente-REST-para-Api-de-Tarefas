import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TesteApi {
    @Headers("Student:1111008114")
    @GET("tasks")
    Call<List<Task>> getTask();

    @Headers("Student:1111008114")
    @POST("tasks")
    Call<Task> createTask(@Body Task task);

    @Headers("Student:1111008114")
    @GET("tasks/{id}")
    Call<Task> getTaskId(@Path("id") String id);

    @Headers("Student:1111008114")
    @PUT("tasks/{id}")
    Call<Void> updateTaskId(@Body Task task, @Path("id") String id);

    @Headers("Student:1111008114")
    @DELETE("tasks/{id}")
    Call<Void> deleteTaskId(@Path("id") String id);
}
