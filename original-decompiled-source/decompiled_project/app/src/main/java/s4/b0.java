package s4;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.s implements eh.a<j1<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24199a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(m<Object> mVar) {
        super(0);
        this.f24199a = mVar;
    }

    @Override // eh.a
    public final j1<Object> invoke() throws IOException {
        n0 n0Var = this.f24199a.f24304a;
        File canonicalFile = ((File) n0Var.f24344c.invoke()).getCanonicalFile();
        synchronized (n0.f24341e) {
            String path = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = n0.f24340d;
            if (linkedHashSet.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.r.d(path, "path");
            linkedHashSet.add(path);
        }
        return new q0(canonicalFile, n0Var.f24342a, n0Var.f24343b.invoke(canonicalFile), new m0(canonicalFile));
    }
}
