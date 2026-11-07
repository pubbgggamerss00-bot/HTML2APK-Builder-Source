package s9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f24785a;

    /* renamed from: b, reason: collision with root package name */
    public final h f24786b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24787c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f24788a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f24789b = null;

        public a(Context context) {
            this.f24788a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final d a(String str) throws PackageManager.NameNotFoundException {
            Bundle bundle;
            Map<String, String> map;
            PackageManager packageManager;
            if (this.f24789b == null) {
                Context context = this.f24788a;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                        if (bundle != null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            map = Collections.EMPTY_MAP;
                        } else {
                            HashMap map2 = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                Object obj = bundle.get(str2);
                                if ((obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map2.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            map = map2;
                        }
                        this.f24789b = map;
                    }
                }
                bundle = null;
                if (bundle != null) {
                }
                this.f24789b = map;
            }
            String str4 = this.f24789b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
                return null;
            }
        }
    }

    public j(Context context, h hVar) {
        a aVar = new a(context);
        this.f24787c = new HashMap();
        this.f24785a = aVar;
        this.f24786b = hVar;
    }

    @Override // s9.e
    public final synchronized l get(String str) {
        if (this.f24787c.containsKey(str)) {
            return (l) this.f24787c.get(str);
        }
        d dVarA = this.f24785a.a(str);
        if (dVarA == null) {
            return null;
        }
        h hVar = this.f24786b;
        l lVarCreate = dVarA.create(new c(hVar.f24781a, hVar.f24782b, hVar.f24783c, str));
        this.f24787c.put(str, lVarCreate);
        return lVarCreate;
    }
}
