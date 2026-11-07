package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import com.google.android.gms.ads.internal.util.client.zzu;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f6312t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6313u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6314v;

    public /* synthetic */ kb0(int i6, Object obj, Object obj2, String str) {
        this.s = i6;
        this.f6313u = obj;
        this.f6312t = str;
        this.f6314v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final JSONObject jSONObject;
        switch (this.s) {
            case 0:
                ((mb0) this.f6313u).q0(this.f6312t, (ValueCallback) this.f6314v);
                break;
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f6313u;
                zzu zzuVar = (zzu) this.f6314v;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{this.f6312t});
                dz0.c(sQLiteDatabase, zzuVar);
                break;
            default:
                String str = this.f6312t;
                if (TextUtils.isEmpty(str)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    break;
                } else {
                    String str2 = (String) this.f6313u;
                    final String lowerCase = str.toLowerCase();
                    if (TextUtils.isEmpty(str2)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str2);
                        } catch (JSONException unused) {
                            Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                        }
                    }
                    com.google.android.gms.internal.consent_sdk.n0[] n0VarArr = (com.google.android.gms.internal.consent_sdk.n0[]) this.f6314v;
                    Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                    for (final com.google.android.gms.internal.consent_sdk.n0 n0Var : n0VarArr) {
                        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.k
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(n0Var.a(lowerCase, jSONObject));
                            }
                        });
                        n0Var.zza().execute(futureTask);
                        try {
                        } catch (InterruptedException e6) {
                            Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e6);
                        } catch (ExecutionException e7) {
                            Log.d("UserMessagingPlatform", androidx.camera.camera2.internal.v0.b("Failed to run Action[", lowerCase, "]: "), e7.getCause());
                        }
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            break;
                        }
                    }
                    break;
                }
        }
    }

    public /* synthetic */ kb0(String str, String str2, com.google.android.gms.internal.consent_sdk.n0[] n0VarArr) {
        this.s = 2;
        this.f6312t = str;
        this.f6313u = str2;
        this.f6314v = n0VarArr;
    }
}
