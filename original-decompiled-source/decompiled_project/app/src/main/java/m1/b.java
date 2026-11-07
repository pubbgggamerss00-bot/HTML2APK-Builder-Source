package m1;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import eh.l;
import f3.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.b0;
import q1.c0;
import q1.w0;
import s1.a;

/* loaded from: classes.dex */
public final class b extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final f3.e f17616a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17617b;

    /* renamed from: c, reason: collision with root package name */
    public final l<s1.e, f0> f17618c;

    public b(f3.e eVar, long j10, l lVar) {
        this.f17616a = eVar;
        this.f17617b = j10;
        this.f17618c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        s1.a aVar = new s1.a();
        r rVar = r.f8828a;
        Canvas canvas2 = c0.f21657a;
        b0 b0Var = new b0();
        b0Var.f21645a = canvas;
        a.C0270a c0270a = aVar.f24172a;
        f3.d dVar = c0270a.f24176a;
        r rVar2 = c0270a.f24177b;
        w0 w0Var = c0270a.f24178c;
        long j10 = c0270a.f24179d;
        c0270a.f24176a = this.f17616a;
        c0270a.f24177b = rVar;
        c0270a.f24178c = b0Var;
        c0270a.f24179d = this.f17617b;
        b0Var.d();
        this.f17618c.invoke(aVar);
        b0Var.o();
        c0270a.f24176a = dVar;
        c0270a.f24177b = rVar2;
        c0270a.f24178c = w0Var;
        c0270a.f24179d = j10;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j10 = this.f17617b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        f3.e eVar = this.f17616a;
        point.set(eVar.b1(fIntBitsToFloat / eVar.getDensity()), eVar.b1(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) / eVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
