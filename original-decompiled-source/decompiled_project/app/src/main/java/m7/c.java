package m7;

import android.graphics.drawable.AnimatedImageDrawable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {136}, m = "wrapDrawable")
/* loaded from: classes.dex */
public final class c extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public b f17685a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatedImageDrawable f17686b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f17688d;

    /* renamed from: e, reason: collision with root package name */
    public int f17689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, vg.c cVar) {
        super(cVar);
        this.f17688d = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f17687c = obj;
        this.f17689e |= PKIFailureInfo.systemUnavail;
        return this.f17688d.b(null, this);
    }
}
