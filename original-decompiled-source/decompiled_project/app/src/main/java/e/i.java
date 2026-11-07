package e;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class i extends c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f8107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a<Object, Object> f8109c;

    public i(f fVar, String str, f.a<Object, Object> aVar) {
        this.f8107a = fVar;
        this.f8108b = str;
        this.f8109c = aVar;
    }

    @Override // e.c
    public final void a(Object obj) {
        f fVar = this.f8107a;
        ArrayList arrayList = fVar.f8095d;
        LinkedHashMap linkedHashMap = fVar.f8093b;
        String str = this.f8108b;
        Object obj2 = linkedHashMap.get(str);
        f.a<Object, Object> aVar = this.f8109c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            fVar.b(iIntValue, aVar, obj);
        } catch (Exception e10) {
            arrayList.remove(str);
            throw e10;
        }
    }

    public final void b() {
        this.f8107a.e(this.f8108b);
    }
}
