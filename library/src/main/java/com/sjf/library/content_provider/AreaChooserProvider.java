package com.sjf.library.content_provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sjf.library.global.Global;

/**
 * Function: 用于全局初始化 和 获取 Application Context
 * Date: 2020/5/14 9:13
 * Description:
 *
 * @author ShiJingFeng
 */
public class AreaChooserProvider extends ContentProvider {

    /**
     * 在 Application onCreate 执行前执行，
     * @return 内容提供器成功加载 返回 true, 否则 返回 false
     */
    @Override
    public boolean onCreate() {
        Log.e("测试", "AreaChooserProvider onCreate Context: " + (getContext() == null ? "null" : getContext().getClass().getName()));
        Global.sContext = getContext();
        return true;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }
}
