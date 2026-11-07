package p2;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;

@vg.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {HeaderItem.METHOD_COUNT_OFFSET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements eh.p<Float, tg.e<? super Float>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f21167a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f21168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f21169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f21169c = cVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        f fVar = new f(this.f21169c, eVar);
        fVar.f21168b = ((Number) obj).floatValue();
        return fVar;
    }

    @Override // eh.p
    public final Object invoke(Float f10, tg.e<? super Float> eVar) {
        return ((f) create(Float.valueOf(f10.floatValue()), eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f21167a;
        if (i10 == 0) {
            pg.q.b(obj);
            float f10 = this.f21168b;
            c cVar = this.f21169c;
            eh.p pVar = (eh.p) q2.m.a(cVar.f21144a.f21811d, q2.k.f21777e);
            if (pVar == null) {
                throw k1.a.a("Required value was null.");
            }
            p1.c cVar2 = new p1.c((Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax));
            this.f21167a = 1;
            obj = pVar.invoke(cVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((p1.c) obj).f21129a & BodyPartID.bodyIdMax)));
    }
}
