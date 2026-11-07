package g4;

import e4.o;
import f4.a0;
import f4.b0;
import f4.c0;
import f4.d0;
import f4.i;
import f4.j;
import f4.k;
import f4.l;
import f4.m;
import f4.n;
import f4.p;
import f4.q;
import f4.s;
import f4.t;
import f4.u;
import f4.v;
import f4.w;
import f4.x;
import f4.y;
import f4.z;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11468d = 0;

    public static final class a {
        public static o a(String type, String str) throws i4.b {
            Exception excB;
            r.e(type, "type");
            try {
                c cVar = new c(new b0(), null);
                if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    excB = b3.e.b(new f4.a(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                    excB = b3.e.b(new f4.b(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                    excB = b3.e.b(new f4.c(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                    excB = b3.e.b(new f4.d(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                    excB = b3.e.b(new f4.f(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                    excB = b3.e.b(new f4.g(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                    excB = b3.e.b(new f4.h(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                    excB = b3.e.b(new i(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                    excB = b3.e.b(new j(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                    excB = b3.e.b(new k(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                    excB = b3.e.b(new l(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                    excB = b3.e.b(new m(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                    excB = b3.e.b(new n(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                    excB = b3.e.b(new f4.o(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                    excB = b3.e.b(new p(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                    excB = b3.e.b(new q(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                    excB = b3.e.b(new f4.r(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                    excB = b3.e.b(new s(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                    excB = b3.e.b(new t(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                    excB = b3.e.b(new u(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                    excB = b3.e.b(new v(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                    excB = b3.e.b(new w(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                    excB = b3.e.b(new x(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                    excB = b3.e.b(new y(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                    excB = b3.e.b(new z(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                    excB = b3.e.b(new a0(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                    excB = b3.e.b(new b0(), str, cVar);
                } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                    excB = b3.e.b(new c0(), str, cVar);
                } else {
                    if (!type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                        throw new i4.b();
                    }
                    excB = b3.e.b(new d0(), str, cVar);
                }
                return (o) excB;
            } catch (i4.b unused) {
                return new e4.n(str, type);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(f4.e eVar, String str) {
        String type = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(eVar.f8838a);
        r.e(type, "type");
        super(str, type);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
