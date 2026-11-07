package d;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.a<Object, Object> f12652c;

    public h(e eVar, String str, e.a<Object, Object> aVar) {
        this.f12650a = eVar;
        this.f12651b = str;
        this.f12652c = aVar;
    }

    @Override // d.c
    public final void a(Object obj) throws Exception {
        e eVar = this.f12650a;
        ArrayList arrayList = eVar.f12639d;
        LinkedHashMap linkedHashMap = eVar.f12637b;
        String str = this.f12651b;
        Object obj2 = linkedHashMap.get(str);
        e.a<Object, Object> aVar = this.f12652c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            eVar.b(iIntValue, aVar, obj);
        } catch (Exception e6) {
            arrayList.remove(str);
            throw e6;
        }
    }
}
