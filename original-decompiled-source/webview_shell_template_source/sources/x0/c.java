package x0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;
import u0.r0;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f15113a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<InterfaceC0101c> f15114b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public m0.b f15115c;

    /* renamed from: d, reason: collision with root package name */
    public m0.b f15116d;

    /* renamed from: e, reason: collision with root package name */
    public int f15117e;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends View {
        public final /* synthetic */ ViewGroup s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.s = viewGroup;
        }

        @Override // android.view.View
        public final void onConfigurationChanged(Configuration configuration) {
            c cVar = c.this;
            ArrayList<InterfaceC0101c> arrayList = cVar.f15114b;
            Drawable background = this.s.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (cVar.f15117e != color) {
                cVar.f15117e = color;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).c();
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends r0.b {

        /* renamed from: b, reason: collision with root package name */
        public final HashMap<r0, Integer> f15119b = new HashMap<>();

        public b() {
        }

        @Override // u0.r0.b
        public final void a(r0 r0Var) {
            ArrayList<InterfaceC0101c> arrayList = c.this.f15114b;
            if ((r0Var.f14524a.d() & 519) != 0) {
                this.f15119b.remove(r0Var);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
            }
        }

        @Override // u0.r0.b
        public final void b(r0 r0Var) {
            ArrayList<InterfaceC0101c> arrayList = c.this.f15114b;
            if ((r0Var.f14524a.d() & 519) != 0) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).b();
                }
            }
        }

        @Override // u0.r0.b
        public final s0 c(s0 s0Var, List<r0> list) {
            ArrayList<InterfaceC0101c> arrayList = c.this.f15114b;
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            for (int size = list.size() - 1; size >= 0; size--) {
                r0 r0Var = list.get(size);
                Integer num = this.f15119b.get(r0Var);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = r0Var.f14524a.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                }
            }
            m0.b.b(s0Var.f14553a.f(519), s0Var.f14553a.f(64));
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).d();
            }
            return s0Var;
        }

        @Override // u0.r0.b
        public final r0.a d(r0 r0Var, r0.a aVar) {
            if ((r0Var.f14524a.d() & 519) != 0) {
                m0.b bVar = aVar.f14526b;
                m0.b bVar2 = aVar.f14525a;
                int i6 = bVar.f13854a != bVar2.f13854a ? 1 : 0;
                if (bVar.f13855b != bVar2.f13855b) {
                    i6 |= 2;
                }
                if (bVar.f13856c != bVar2.f13856c) {
                    i6 |= 4;
                }
                if (bVar.f13857d != bVar2.f13857d) {
                    i6 |= 8;
                }
                this.f15119b.put(r0Var, Integer.valueOf(i6));
            }
            return aVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: x0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0101c {
        void a();

        void b();

        void c();

        void d();

        void e(m0.b bVar, m0.b bVar2);
    }

    public c(ViewGroup viewGroup) {
        m0.b bVar = m0.b.f13853e;
        this.f15115c = bVar;
        this.f15116d = bVar;
        Drawable background = viewGroup.getBackground();
        this.f15117e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f15113a = aVar;
        aVar.setWillNotDraw(true);
        e eVar = new e(6, this);
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        f0.d.k(aVar, eVar);
        f0.o(aVar, new b());
        viewGroup.addView(aVar, 0);
    }
}
