package com.example.controlled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.controlled.API.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btn_rainbow, btn_single_red, btn_single_blue, btn_single_green, btn_single_pink;
    Button btn_single_purple, btn_single_orange, btn_blue_sea, btn_wave, btn_blue_wave;
    Button btn_green_wave, btn_red_wave, btn_wave1, btn_wave2, btn_wave3;
    Button btn_random_blink, btn_audi, btn_red_audi, btn_green_audi, btn_blue_audi, btn_audi1, btn_audi2;
    Button btn_audi3, btn_blue_circle, btn_green_circle, btn_red_circle, btn_circle1, btn_circle2, btn_circle3;
    Button btn_swirl, btn_bloom, btn_red_heart_beat, btn_green_heart_beat, btn_blue_heart_beat, btn_heart_beat1;
    Button btn_heart_beat2, btn_heart_beat3, btn_ledbyled, btn_tail_flash, btn_moving_rainbow, btn_fire_tail, btn_following_tail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeButtons();
        setButtonListeners();
    }
    private void initializeButtons() {
        btn_rainbow = findViewById(R.id.btn_rainbow);
        btn_single_red = findViewById(R.id.btn_single_red);
        btn_single_blue = findViewById(R.id.btn_single_blue);
        btn_single_green = findViewById(R.id.btn_single_green);
        btn_single_pink = findViewById(R.id.btn_single_pink);
        btn_single_purple = findViewById(R.id.btn_single_purple);
        btn_single_orange = findViewById(R.id.btn_single_orange);
        btn_blue_sea = findViewById(R.id.btn_blue_sea);
        btn_wave = findViewById(R.id.btn_wave);
        btn_blue_wave = findViewById(R.id.btn_blue_wave);
        btn_green_wave = findViewById(R.id.btn_green_wave);
        btn_red_wave = findViewById(R.id.btn_red_wave);
        btn_wave1 = findViewById(R.id.btn_wave1);
        btn_wave2 = findViewById(R.id.btn_wave2);
        btn_wave3 = findViewById(R.id.btn_wave3);
        btn_random_blink = findViewById(R.id.btn_random_blink);
        btn_audi = findViewById(R.id.btn_audi);
        btn_red_audi = findViewById(R.id.btn_audi_red);
        btn_green_audi = findViewById(R.id.btn_audi_green);
        btn_blue_audi = findViewById(R.id.btn_audi_blue);
        btn_audi1 = findViewById(R.id.btn_audi1);
        btn_audi2 = findViewById(R.id.btn_audi2);
        btn_audi3 = findViewById(R.id.btn_audi3);
        btn_blue_circle = findViewById(R.id.btn_blue_circle);
        btn_green_circle = findViewById(R.id.btn_green_circle);
        btn_red_circle = findViewById(R.id.btn_red_circle);
        btn_circle1 = findViewById(R.id.btn_circle1);
        btn_circle2 = findViewById(R.id.btn_circle2);
        btn_circle3 = findViewById(R.id.btn_circle3);
        btn_swirl = findViewById(R.id.btn_swirl);
        btn_bloom = findViewById(R.id.btn_bloom);
        btn_red_heart_beat = findViewById(R.id.btn_heartbeat_red);
        btn_green_heart_beat = findViewById(R.id.btn_heartbeat_green);
        btn_blue_heart_beat = findViewById(R.id.btn_heartbeat_blue);
        btn_heart_beat1 = findViewById(R.id.btn_heartbeat1);
        btn_heart_beat2 = findViewById(R.id.btn_heartbeat2);
        btn_heart_beat3 = findViewById(R.id.btn_heartbeat3);
        btn_ledbyled = findViewById(R.id.btn_ledbyled);
        btn_tail_flash = findViewById(R.id.btn_tail_flash);
        btn_moving_rainbow = findViewById(R.id.btn_moving_rainbow);
        btn_fire_tail = findViewById(R.id.btn_fire_tail);
        btn_following_tail = findViewById(R.id.btn_following_light);
    }

    private void setButtonListeners() {
        setOnClickListener(btn_rainbow, "rainbow");
        setOnClickListener(btn_single_red, "single_red");
        setOnClickListener(btn_single_blue, "single_blue");
        setOnClickListener(btn_single_green, "single_green");
        setOnClickListener(btn_single_pink, "single_pink");
        setOnClickListener(btn_single_purple, "single_purple");
        setOnClickListener(btn_single_orange, "single_orange");
        setOnClickListener(btn_blue_sea, "blue_sea");
        setOnClickListener(btn_wave, "wave");
        setOnClickListener(btn_blue_wave, "wave_blue");
        setOnClickListener(btn_green_wave, "wave_green");
        setOnClickListener(btn_red_wave, "wave_red");
        setOnClickListener(btn_wave1, "wave1");
        setOnClickListener(btn_wave2, "wave2");
        setOnClickListener(btn_wave3, "wave3");
        setOnClickListener(btn_random_blink, "random");
        setOnClickListener(btn_audi, "audi");
        setOnClickListener(btn_red_audi, "audi_red");
        setOnClickListener(btn_green_audi, "audi_green");
        setOnClickListener(btn_blue_audi, "audi_blue");
        setOnClickListener(btn_audi1, "audi_green_blue");
        setOnClickListener(btn_audi2, "audi_green_red");
        setOnClickListener(btn_audi3, "audi_blue_red");
        setOnClickListener(btn_blue_circle, "circle_blue");
        setOnClickListener(btn_green_circle, "circle_green");
        setOnClickListener(btn_red_circle, "circle_red");
        setOnClickListener(btn_circle1, "circle1");
        setOnClickListener(btn_circle2, "circle2");
        setOnClickListener(btn_circle3, "circle3");
        setOnClickListener(btn_swirl, "swirl");
        setOnClickListener(btn_bloom, "bloom");
        setOnClickListener(btn_red_heart_beat, "heart_beat_red");
        setOnClickListener(btn_green_heart_beat, "heart_beat_green");
        setOnClickListener(btn_blue_heart_beat, "heart_beat_blue");
        setOnClickListener(btn_heart_beat1, "heart_beat1");
        setOnClickListener(btn_heart_beat2, "heart_beat2");
        setOnClickListener(btn_heart_beat3, "heart_beat3");
        setOnClickListener(btn_ledbyled, "led_by_led");
        setOnClickListener(btn_tail_flash, "tail");
        setOnClickListener(btn_moving_rainbow, "moving_rainbow");
        setOnClickListener(btn_fire_tail, "fire_tail");
        setOnClickListener(btn_following_tail, "following_light");
    }
    private void setOnClickListener(Button button, final String command) {
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sendLedCommand(command);
                }
            });
        }
    }
    private void sendLedCommand(String effect) {
        RetrofitClient.getInstance().setEffect(effect).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Log.d("LED", "Đã gửi hiệu ứng: " + effect);
                } else {
                    Log.e("LED", "Lỗi khi gửi lệnh");
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Log.e("LED", "Lỗi kết nối: " + t.getMessage());
            }
        });
    }
}