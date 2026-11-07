package androidx.room;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f3016c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3017d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f3018e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3019f;

    /* renamed from: g, reason: collision with root package name */
    public final k f3020g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f3021h;

    /* renamed from: i, reason: collision with root package name */
    public r f3022i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3023j;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f3024a;

        public a(String[] strArr) {
            this.f3024a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.room.k] */
    public m(g0 g0Var, HashMap map, HashMap map2, String... strArr) {
        this.f3014a = g0Var;
        this.f3015b = strArr;
        a1 a1Var = new a1(g0Var, map, map2, strArr, g0Var.getUseTempTrackingTable$room_runtime_release(), new n(1, this, m.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.f3016c = a1Var;
        this.f3017d = new LinkedHashMap();
        this.f3018e = new ReentrantLock();
        this.f3019f = new j(this, 0);
        this.f3020g = new eh.a() { // from class: androidx.room.k
            @Override // eh.a
            public final Object invoke() {
                this.f3006a.getClass();
                return pg.f0.f21461a;
            }
        };
        kotlin.jvm.internal.r.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f3023j = new Object();
        a1Var.f2846k = new l(this, 0);
    }

    public final Object a(vg.i iVar) {
        Object objF;
        g0 g0Var = this.f3014a;
        return ((!g0Var.inCompatibilityMode$room_runtime_release() || g0Var.isOpenInternal()) && (objF = this.f3016c.f(iVar)) == ug.a.f29706a) ? objF : pg.f0.f21461a;
    }
}
