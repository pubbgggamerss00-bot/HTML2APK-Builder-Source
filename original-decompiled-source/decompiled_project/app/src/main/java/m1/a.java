package m1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import androidx.compose.ui.platform.AndroidComposeView;
import i2.a1;
import i2.n2;
import i2.p2;
import kotlin.jvm.internal.b0;
import p.b;

/* loaded from: classes.dex */
public final class a implements View.OnDragListener, d {

    /* renamed from: a, reason: collision with root package name */
    public final g f17613a = new g(null);

    /* renamed from: b, reason: collision with root package name */
    public final p.b<i> f17614b = new p.b<>(0);

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f17615c = new a1<g>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // i2.a1
        public final d.c a() {
            return this.f1158b.f17613a;
        }

        @Override // i2.a1
        public final /* bridge */ /* synthetic */ void b(d.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f1158b.f17613a.hashCode();
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a(AndroidComposeView.g gVar) {
    }

    @Override // m1.d
    public final boolean a(g gVar) {
        return this.f17614b.contains(gVar);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        c cVar = new c(dragEvent);
        int action = dragEvent.getAction();
        p.b<i> bVar = this.f17614b;
        g gVar = this.f17613a;
        switch (action) {
            case 1:
                gVar.getClass();
                b0 b0Var = new b0();
                f fVar = new f(cVar, gVar, b0Var);
                if (fVar.invoke(gVar) == n2.f13963a) {
                    p2.c(gVar, fVar);
                }
                boolean z10 = b0Var.f16318a;
                bVar.getClass();
                b.a aVar = new b.a();
                while (aVar.hasNext()) {
                    ((i) aVar.next()).V(cVar);
                }
                break;
            case 2:
                gVar.b0(cVar);
                break;
            case 4:
                gVar.l0(cVar);
                bVar.clear();
                break;
            case 5:
                gVar.L0(cVar);
                break;
            case 6:
                gVar.a0(cVar);
                break;
        }
        return false;
    }
}
