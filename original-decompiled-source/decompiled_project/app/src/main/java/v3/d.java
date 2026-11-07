package v3;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.s;
import r3.u;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final s<a, ProviderInfo> f30563a = new s<>(2);

    /* renamed from: b, reason: collision with root package name */
    public static final org.jf.dexlib2.dexbacked.raw.a f30564b = new org.jf.dexlib2.dexbacked.raw.a(1);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f30565a;

        /* renamed from: b, reason: collision with root package name */
        public String f30566b;

        /* renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f30567c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f30565a, aVar.f30565a) && Objects.equals(this.f30566b, aVar.f30566b) && Objects.equals(this.f30567c, aVar.f30567c);
        }

        public final int hashCode() {
            return Objects.hash(this.f30565a, this.f30566b, this.f30567c);
        }
    }

    public static k a(Context context, List list) throws PackageManager.NameNotFoundException {
        String str;
        Typeface typefaceC;
        Trace.beginSection(m6.a.c("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = (e) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = u.c((str = eVar.f30572e))) == null || u.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), eVar, context.getResources());
                    if (providerInfoB == null) {
                        return new k();
                    }
                    arrayList.add(c(context, eVar, providerInfoB.authority));
                } else {
                    arrayList.add(new l[]{new l(str, eVar.f30573f)});
                }
            }
            return new k(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        org.jf.dexlib2.dexbacked.raw.a aVar = f30564b;
        s<a, ProviderInfo> sVar = f30563a;
        Trace.beginSection(m6.a.c("FontProvider.getProvider"));
        try {
            List<List<byte[]>> listB = eVar.f30571d;
            String str = eVar.f30568a;
            String str2 = eVar.f30569b;
            if (listB == null) {
                listB = q3.e.b(resources, 0);
            }
            a aVar2 = new a();
            aVar2.f30565a = str;
            aVar2.f30566b = str2;
            aVar2.f30567c = listB;
            ProviderInfo providerInfo = sVar.get(aVar2);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i10 = 0; i10 < listB.size(); i10++) {
                ArrayList arrayList2 = new ArrayList(listB.get(i10));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                    }
                    sVar.put(aVar2, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static l[] c(Context context, e eVar, String str) {
        Trace.beginSection(m6.a.c("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(m6.a.c("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {eVar.f30570c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e10) {
                            Log.w("FontsProvider", "Unable to query the content provider", e10);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, eVar.f30573f, i10));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (l[]) arrayList.toArray(new l[0]);
                } finally {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } finally {
        }
    }
}
