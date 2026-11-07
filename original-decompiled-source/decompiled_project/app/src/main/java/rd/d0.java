package rd;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zzaj<String> f23358a = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f23359b = new d0();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f5910a);
        editorEdit.putString("statusMessage", status.f5911b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzaj<String> zzajVar = f23358a;
        int size = zzajVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzajVar.get(i10);
            i10++;
            editorEdit.remove(str);
        }
        editorEdit.commit();
    }
}
