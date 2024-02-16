package com.example.myapp;

import java.io.IOException;
//
//import okhttp3.Call;
//import okhttp3.Callback;
//import okhttp3.MediaType;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.RequestBody;
//import okhttp3.Response;
import okhttp3.*;
public class RequestToServer {


        OkHttpClient client = new OkHttpClient();

        public void postRequest(String url, String jsonBody) {
            // Tạo một RequestBody từ dữ liệu JSON
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonBody);

            // Tạo một yêu cầu POST với URL và RequestBody
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            // Thực hiện yêu cầu bất đồng bộ
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    // Xử lý khi gặp lỗi kết nối hoặc gửi yêu cầu không thành công
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    // Xử lý phản hồi từ máy chủ
                    String responseData = response.body().string();
                    System.out.println("Response: " + responseData);
                }
            });
        }

//        public static void main(String[] args) {
//            OkHttpClientExample example = new OkHttpClientExample();
//            String url = "https://example.com/api";
//            String jsonBody = "{\"key\": \"value\"}"; // Dữ liệu JSON bạn muốn gửi
//            example.postRequest(url, jsonBody);
//        }

}
