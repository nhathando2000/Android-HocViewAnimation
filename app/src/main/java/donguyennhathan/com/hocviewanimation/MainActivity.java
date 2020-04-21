package donguyennhathan.com.hocviewanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;

import donguyennhathan.com.hocviewanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void xuLyAlphaAnimation(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
        binding.btnAlpha.startAnimation(animation);
    }

    public void xuLyScaleAnimation(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        binding.btnScale.startAnimation(animation);
    }

    public void xuLyTranslateAnimation(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_animation);
        binding.btnTranslate.startAnimation(animation);
    }

    public void xuLyRotateAnimation(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        binding.btnRotate.startAnimation(animation);
    }

    public void xuLyTongHopAnimation(View view) {
        AnimationSet animation = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.tonghop_animation);
        binding.btnTonghop.startAnimation(animation);
    }

    public void xuLyThoat(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_thoat);
        binding.btnThoat.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
