package hc;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g extends ic.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f12980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f12979b = taskCompletionSource2;
        this.f12980c = iVar;
    }

    @Override // ic.h
    public final void a() {
        HashMap map;
        try {
            i iVar = this.f12980c;
            ic.e eVar = iVar.f12985a.f14470m;
            String str = iVar.f12986b;
            Bundle bundle = new Bundle();
            HashMap map2 = j.f12987a;
            synchronized (j.class) {
                map = j.f12987a;
                map.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
            if (map.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
            }
            if (map.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
            }
            i iVar2 = this.f12980c;
            TaskCompletionSource taskCompletionSource = this.f12979b;
            String str2 = iVar2.f12986b;
            eVar.j(str, bundle, new h(iVar2, taskCompletionSource));
        } catch (RemoteException e10) {
            i iVar3 = this.f12980c;
            ic.g gVar = i.f12984c;
            Object[] objArr = {iVar3.f12986b};
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ic.g.c(gVar.f14444a, "error requesting in-app review for %s", objArr), e10);
            }
            this.f12979b.trySetException(new RuntimeException(e10));
        }
    }
}
