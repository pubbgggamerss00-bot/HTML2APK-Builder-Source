package x2;

import android.graphics.Typeface;
import pg.f0;
import x2.a0;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements eh.l<eh.l<? super a0, ? extends f0>, a0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f32018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f32019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, x xVar) {
        super(1);
        this.f32018a = iVar;
        this.f32019b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 invoke(eh.l<? super a0, ? extends f0> lVar) {
        Typeface typefaceA;
        i iVar = this.f32018a;
        iVar.f32023d.getClass();
        x xVar = this.f32019b;
        f fVar = xVar.f32043a;
        a0.a aVar = null;
        if (fVar instanceof l) {
            throw null;
        }
        v vVar = iVar.f32024e.f32041a;
        int i10 = xVar.f32045c;
        p pVar = xVar.f32044b;
        if (fVar == null ? true : fVar instanceof d) {
            typefaceA = v.a(null, pVar, i10);
        } else {
            if (!(fVar instanceof r)) {
                if (fVar instanceof s) {
                    kotlin.jvm.internal.r.c(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                    throw null;
                }
                if (aVar == null) {
                    return aVar;
                }
                throw new IllegalStateException("Could not load font");
            }
            typefaceA = v.a(((r) fVar).f32039d, pVar, i10);
        }
        aVar = new a0.a(typefaceA);
        if (aVar == null) {
        }
    }
}
