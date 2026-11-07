package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.z0;
import b.o;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6889a;

    /* renamed from: b, reason: collision with root package name */
    public final p.a f6890b = new p.a();

    /* renamed from: com.google.firebase.iid.a$a, reason: collision with other inner class name */
    public static class C0074a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f6891d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f6892e = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f6893a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6894b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6895c;

        public C0074a(String str, String str2, long j10) {
            this.f6893a = str;
            this.f6894b = str2;
            this.f6895c = j10;
        }

        public static String a(String str, String str2, long j10) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String strValueOf = String.valueOf(e10);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public static C0074a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0074a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0074a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                String strValueOf = String.valueOf(e10);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
    }

    public a(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6889a = sharedPreferences;
        File file = new File(p3.b.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                c();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public static String a(String str) {
        return o.a(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    public static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(m.a.a(String.valueOf(str).length(), 4, String.valueOf(str2).length(), str3.length()));
        z0.a(sb, str, "|T|", str2, "|");
        sb.append(str3);
        return sb.toString();
    }

    public final synchronized void c() {
        this.f6890b.clear();
        this.f6889a.edit().clear().commit();
    }

    public final synchronized void d(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = a(str);
        SharedPreferences sharedPreferences = this.f6889a;
        if (sharedPreferences.contains(strA)) {
            String string = sharedPreferences.getString(a(str), null);
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            } else {
                jCurrentTimeMillis = 0;
            }
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(a(str), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        this.f6890b.put(str, Long.valueOf(jCurrentTimeMillis));
    }
}
