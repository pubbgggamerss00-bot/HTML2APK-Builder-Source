package t0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class v6 extends kotlin.jvm.internal.s implements eh.l<u0.d0<ib>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f27226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hb f27228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(float f10, long j10, hb hbVar) {
        super(1);
        this.f27226a = f10;
        this.f27227b = j10;
        this.f27228c = hbVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(u0.d0<ib> d0Var) {
        u0.d0<ib> d0Var2 = d0Var;
        float f10 = this.f27226a;
        Float fValueOf = Float.valueOf(f10);
        LinkedHashMap linkedHashMap = d0Var2.f28972a;
        LinkedHashMap linkedHashMap2 = d0Var2.f28972a;
        linkedHashMap.put(ib.f26108a, fValueOf);
        int i10 = (int) (this.f27227b & BodyPartID.bodyIdMax);
        float f11 = i10;
        if (f11 > f10 / 2 && !this.f27228c.f26014a) {
            linkedHashMap2.put(ib.f26110c, Float.valueOf(f10 / 2.0f));
        }
        if (i10 != 0) {
            linkedHashMap2.put(ib.f26109b, Float.valueOf(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f10 - f11)));
        }
        return pg.f0.f21461a;
    }
}
