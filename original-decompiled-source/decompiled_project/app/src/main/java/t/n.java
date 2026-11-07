package t;

import com.yalantis.ucrop.view.CropImageView;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.u0 f25299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.f f25302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q1.u0 u0Var, long j10, long j11, s1.f fVar) {
        super(1);
        this.f25299a = u0Var;
        this.f25300b = j10;
        this.f25301c = j11;
        this.f25302d = fVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        s1.e.d0(cVar2, this.f25299a, this.f25300b, this.f25301c, CropImageView.DEFAULT_ASPECT_RATIO, this.f25302d, HeaderItem.DATA_SIZE_OFFSET);
        return pg.f0.f21461a;
    }
}
