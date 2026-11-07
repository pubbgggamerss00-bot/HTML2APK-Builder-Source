package q2;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.p0;
import androidx.work.h;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.k;
import com.google.android.gms.internal.ads.uo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r2.l;
import s2.m;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements n2.c, j2.b {
    public static final String B = k.e("SystemFgDispatcher");
    public SystemForegroundService A;
    public final j2.k s;

    /* renamed from: t, reason: collision with root package name */
    public final u2.a f14105t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f14106u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public String f14107v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f14108w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f14109x;

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f14110y;

    /* renamed from: z, reason: collision with root package name */
    public final n2.d f14111z;

    public b(Context context) {
        j2.k kVarB = j2.k.b(context);
        this.s = kVarB;
        u2.b bVar = kVarB.f13477d;
        this.f14105t = bVar;
        this.f14107v = null;
        this.f14108w = new LinkedHashMap();
        this.f14110y = new HashSet();
        this.f14109x = new HashMap();
        this.f14111z = new n2.d(context, bVar, this);
        kVarB.f13479f.a(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f1781a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f1782b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f1783c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f1781a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f1782b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f1783c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // j2.b
    public final void c(String str, boolean z6) {
        Map.Entry entry;
        synchronized (this.f14106u) {
            try {
                l lVar = (l) this.f14109x.remove(str);
                if (lVar != null ? this.f14110y.remove(lVar) : false) {
                    this.f14111z.b(this.f14110y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f14108w.remove(str);
        if (str.equals(this.f14107v) && this.f14108w.size() > 0) {
            Iterator it = this.f14108w.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f14107v = (String) entry.getKey();
            if (this.A != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.A;
                systemForegroundService.f1816t.post(new c(systemForegroundService, hVar2.f1781a, hVar2.f1783c, hVar2.f1782b));
                SystemForegroundService systemForegroundService2 = this.A;
                systemForegroundService2.f1816t.post(new uo(hVar2.f1781a, 1, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.A;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        k kVarC = k.c();
        String str2 = B;
        int i6 = hVar.f1781a;
        int i7 = hVar.f1782b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i6);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        kVarC.a(str2, p0.a(sb, i7, ")"), new Throwable[0]);
        systemForegroundService3.f1816t.post(new uo(hVar.f1781a, 1, systemForegroundService3));
    }

    public final void d(Intent intent) {
        int i6 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k kVarC = k.c();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        kVarC.a(B, p0.a(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.A == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f14108w;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f14107v)) {
            this.f14107v = stringExtra;
            SystemForegroundService systemForegroundService = this.A;
            systemForegroundService.f1816t.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.A;
        systemForegroundService2.f1816t.post(new d(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i6 |= ((h) ((Map.Entry) it.next()).getValue()).f1782b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f14107v);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.A;
            systemForegroundService3.f1816t.post(new c(systemForegroundService3, hVar2.f1781a, hVar2.f1783c, i6));
        }
    }

    @Override // n2.c
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            k.c().a(B, k0.a("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            j2.k kVar = this.s;
            kVar.f13477d.a(new m(kVar, str, true));
        }
    }

    public final void g() {
        this.A = null;
        synchronized (this.f14106u) {
            this.f14111z.c();
        }
        this.s.f13479f.e(this);
    }

    @Override // n2.c
    public final void f(List<String> list) {
    }
}
