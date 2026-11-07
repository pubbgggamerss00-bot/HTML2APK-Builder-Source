package d4;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<v> f7366a;

    public x0(List list) {
        this.f7366a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            int i10 = 0;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ((((v) it.next()) instanceof a1) && (i10 = i10 + 1) < 0) {
                        qg.p.n();
                        throw null;
                    }
                }
            }
            if (i10 > 0 && i10 != this.f7366a.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            Iterator<v> it2 = this.f7366a.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof c1) {
                    throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                }
            }
        }
    }
}
