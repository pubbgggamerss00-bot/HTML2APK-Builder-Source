package zc;

import ed.e0;
import ed.o0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f35031a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.a f35032b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.h f35033c;

    /* renamed from: d, reason: collision with root package name */
    public final e0.b f35034d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f35035e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f35036f;

    public s(String str, com.google.crypto.tink.shaded.protobuf.h hVar, e0.b bVar, o0 o0Var, Integer num) {
        this.f35031a = str;
        this.f35032b = w.b(str);
        this.f35033c = hVar;
        this.f35034d = bVar;
        this.f35035e = o0Var;
        this.f35036f = num;
    }

    public static s a(String str, com.google.crypto.tink.shaded.protobuf.h hVar, e0.b bVar, o0 o0Var, Integer num) throws GeneralSecurityException {
        if (o0Var == o0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new s(str, hVar, bVar, o0Var, num);
    }
}
