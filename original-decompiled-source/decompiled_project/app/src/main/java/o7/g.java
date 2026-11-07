package o7;

import android.content.Context;
import eh.p;
import g7.t;
import java.util.LinkedHashMap;
import o7.a;
import o7.j;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.q;
import ph.i0;
import r7.c;
import w7.m;
import w7.o;

@vg.e(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements p<i0, tg.e<? super o>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f19031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f19032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w7.f f19033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f19035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g7.h f19036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c.b f19037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j.a f19038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, w7.f fVar, Object obj, m mVar, g7.h hVar, c.b bVar, j.a aVar2, tg.e<? super g> eVar) {
        super(2, eVar);
        this.f19032b = aVar;
        this.f19033c = fVar;
        this.f19034d = obj;
        this.f19035e = mVar;
        this.f19036f = hVar;
        this.f19037g = bVar;
        this.f19038h = aVar2;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new g(this.f19032b, this.f19033c, this.f19034d, this.f19035e, this.f19036f, this.f19037g, this.f19038h, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super o> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        boolean z10;
        r7.c cVarC;
        c.b bVar = this.f19037g;
        a aVar = this.f19032b;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f19031a;
        if (i10 == 0) {
            q.b(obj);
            a aVar3 = this.f19032b;
            w7.f fVar = this.f19033c;
            Object obj2 = this.f19034d;
            m mVar = this.f19035e;
            g7.h hVar = this.f19036f;
            this.f19031a = 1;
            objC = a.c(aVar3, fVar, obj2, mVar, hVar, this);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            objC = obj;
        }
        a.C0215a c0215a = (a.C0215a) objC;
        b8.a aVar4 = aVar.f18978b;
        synchronized (aVar4) {
            try {
                t tVar = aVar4.f3665a.get();
                if (tVar == null) {
                    aVar4.a();
                } else if (aVar4.f3666b == null) {
                    Context context = tVar.f11525a.f11530a;
                    aVar4.f3666b = context;
                    context.registerComponentCallbacks(aVar4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r7.d dVar = aVar.f18980d;
        w7.f fVar2 = this.f19033c;
        if (bVar == null || !fVar2.f31336i.f31324b || !c0215a.f18981a.b() || (cVarC = dVar.f23224a.c()) == null) {
            z10 = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c0215a.f18982b));
            String str = c0215a.f18984d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            cVarC.c(bVar, new c.C0257c(c0215a.f18981a, linkedHashMap));
            z10 = true;
        }
        g7.l lVar = c0215a.f18981a;
        w7.f fVar3 = this.f19033c;
        j7.f fVar4 = c0215a.f18983c;
        if (!z10) {
            bVar = null;
        }
        c.b bVar2 = bVar;
        String str2 = c0215a.f18984d;
        boolean z11 = c0215a.f18982b;
        j.a aVar5 = this.f19038h;
        return new o(lVar, fVar3, fVar4, bVar2, str2, z11, (aVar5 instanceof l) && ((l) aVar5).f19059g);
    }
}
