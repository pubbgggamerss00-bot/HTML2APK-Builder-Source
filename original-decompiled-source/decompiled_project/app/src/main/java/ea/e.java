package ea;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends a.AbstractC0063a {
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, Object obj, h.a aVar, h.b bVar) {
        return new ka.g(context, looper, dVar, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.f5872b);
    }
}
