package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.gestures.f;
import eh.l;
import eh.p;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import pg.q;
import v.t0;
import v.w;
import v.x;

@vg.e(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {300}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements p<w, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f887a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f890d;

    public static final class a extends s implements l<a.b, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f891a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, h hVar) {
            super(1);
            this.f891a = wVar;
            this.f892b = hVar;
        }

        @Override // eh.l
        public final f0 invoke(a.b bVar) {
            long j10 = bVar.f836a;
            h hVar = this.f892b;
            long jH = p1.c.h(hVar.G ? -1.0f : 1.0f, j10);
            t0 t0Var = hVar.C;
            x.a aVar = x.f30113a;
            this.f891a.a(Float.intBitsToFloat((int) (t0Var == t0.f30083a ? jH & BodyPartID.bodyIdMax : jH >> 32)));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f.a aVar, h hVar, tg.e eVar) {
        super(2, eVar);
        this.f889c = aVar;
        this.f890d = hVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        g gVar = new g(this.f889c, this.f890d, eVar);
        gVar.f888b = obj;
        return gVar;
    }

    @Override // eh.p
    public final Object invoke(w wVar, tg.e<? super f0> eVar) {
        return ((g) create(wVar, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f887a;
        if (i10 == 0) {
            q.b(obj);
            a aVar2 = new a((w) this.f888b, this.f890d);
            this.f887a = 1;
            if (this.f889c.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
