package androidx.credentials.playservices.controllers.identityauth.createpassword;

import bi.l;
import di.u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.json.s;
import pg.f0;
import q5.o;
import qg.a0;
import qg.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1486c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f1484a = i10;
        this.f1485b = obj;
        this.f1486c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f1484a) {
            case 0:
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0((CredentialProviderCreatePasswordController) this.f1485b, (e4.g) this.f1486c);
            case 1:
                bi.f fVar = (bi.f) this.f1485b;
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) this.f1486c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kotlinx.serialization.json.f fVar2 = bVar.f16436a;
                u.d(fVar, bVar);
                int iE = fVar.e();
                for (int i10 = 0; i10 < iE; i10++) {
                    List<Annotation> listG = fVar.g(i10);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listG) {
                        if (obj instanceof s) {
                            arrayList.add(obj);
                        }
                    }
                    s sVar = (s) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (sVar != null && (strArrNames = sVar.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = r.a(fVar.getKind(), l.b.f4277a) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String message = "The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i10) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) k0.c(str, linkedHashMap)).intValue()) + " in " + fVar;
                                r.e(message, "message");
                                throw new di.s(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i10));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? a0.f22708a : linkedHashMap;
            default:
                ((o) this.f1485b).e((p5.s) this.f1486c, false);
                return f0.f21461a;
        }
    }
}
