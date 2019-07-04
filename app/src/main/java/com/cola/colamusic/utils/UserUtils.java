package com.cola.colamusic.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.cola.colamusic.R;
import com.cola.colamusic.activities.LoginActivity;

public class UserUtils {

    /**
     * 验证登录用户输入用户合法性
     */
    public static boolean validateLogin(Context context, String phone, String password) {

        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    /**
     * 退出登录
     */
    public static void logout(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        //添加intent标志服，并且生成一个新的task
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        ((Activity) context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }
}
