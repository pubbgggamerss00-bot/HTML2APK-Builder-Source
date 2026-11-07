package dc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f7834a;

    public /* synthetic */ l(m mVar) {
        this.f7834a = mVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cc.e eVar = (cc.e) this.f7834a;
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            eVar.f7835a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        eVar.f7835a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            eVar.f7835a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        n nVar = eVar.f7835a;
        nVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        nVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        nVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        ec.b bVar = new ec.b(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        eVar.f7835a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", bVar);
        synchronized (eVar) {
            Iterator it = new HashSet(eVar.f7838d).iterator();
            while (it.hasNext()) {
                ((gc.a) it.next()).a(bVar);
            }
        }
    }
}
