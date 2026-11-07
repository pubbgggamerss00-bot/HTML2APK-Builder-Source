package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import u0.n0;
import u0.o0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f13435c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f13436d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13437e;

    /* renamed from: b, reason: collision with root package name */
    public long f13434b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final a f13438f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<n0> f13433a = new ArrayList<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends f5.b {
        public boolean s = false;

        /* renamed from: t, reason: collision with root package name */
        public int f13439t = 0;

        public a() {
        }

        @Override // u0.o0
        public final void a() {
            int i6 = this.f13439t + 1;
            this.f13439t = i6;
            g gVar = g.this;
            if (i6 == gVar.f13433a.size()) {
                o0 o0Var = gVar.f13436d;
                if (o0Var != null) {
                    o0Var.a();
                }
                this.f13439t = 0;
                this.s = false;
                gVar.f13437e = false;
            }
        }

        @Override // f5.b, u0.o0
        public final void b() {
            if (this.s) {
                return;
            }
            this.s = true;
            o0 o0Var = g.this.f13436d;
            if (o0Var != null) {
                o0Var.b();
            }
        }
    }

    public final void a() {
        if (this.f13437e) {
            ArrayList<n0> arrayList = this.f13433a;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                n0 n0Var = arrayList.get(i6);
                i6++;
                n0Var.b();
            }
            this.f13437e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f13437e) {
            return;
        }
        ArrayList<n0> arrayList = this.f13433a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            n0 n0Var = arrayList.get(i6);
            i6++;
            n0 n0Var2 = n0Var;
            long j6 = this.f13434b;
            if (j6 >= 0) {
                n0Var2.c(j6);
            }
            Interpolator interpolator = this.f13435c;
            if (interpolator != null && (view = n0Var2.f14521a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f13436d != null) {
                n0Var2.d(this.f13438f);
            }
            View view2 = n0Var2.f14521a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f13437e = true;
    }
}
