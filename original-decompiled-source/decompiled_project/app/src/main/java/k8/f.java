package k8;

import eh.p;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.q;
import ph.i0;
import sh.k0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.data.catgame.CatGameManager$1", f = "CatGameManager.kt", l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f16087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f16088b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f16089a;

        public a(h hVar) {
            this.f16089a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            Object value;
            i iVar;
            Object value2;
            i iVar2;
            Object value3;
            String sku = (String) obj;
            h hVar = this.f16089a;
            z0 z0Var = hVar.f16096c;
            r.e(sku, "sku");
            int iHashCode = sku.hashCode();
            if (iHashCode != -750207177) {
                if (iHashCode != 1089955077) {
                    if (iHashCode == 1942880572 && sku.equals("cat_vip_pass")) {
                        do {
                            value3 = z0Var.getValue();
                        } while (!z0Var.a(value3, i.a((i) value3, 0L, 0L, 0, 0L, 0, 0L, 0, 0, 0L, null, null, null, null, null, 32767)));
                        hVar.j();
                    }
                } else if (sku.equals("cat_tuna_small")) {
                    do {
                        value2 = z0Var.getValue();
                        iVar2 = (i) value2;
                    } while (!z0Var.a(value2, i.a(iVar2, 0L, 0L, iVar2.f16122c + 50, 0L, 0, 0L, 0, 0, 0L, null, null, null, null, null, 65531)));
                    hVar.j();
                }
            } else if (sku.equals("cat_tuna_medium")) {
                do {
                    value = z0Var.getValue();
                    iVar = (i) value;
                } while (!z0Var.a(value, i.a(iVar, 0L, 0L, iVar.f16122c + 300, 0L, 0, 0L, 0, 0, 0L, null, null, null, null, null, 65531)));
                hVar.j();
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f16088b = hVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new f(this.f16088b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        ((f) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f16087a;
        if (i10 == 0) {
            q.b(obj);
            h hVar = this.f16088b;
            k0 k0Var = hVar.f16094a.f14224d;
            a aVar2 = new a(hVar);
            this.f16087a = 1;
            if (k0Var.f25017a.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        throw new pg.g();
    }
}
