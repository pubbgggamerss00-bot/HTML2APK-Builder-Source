package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import mh.t;
import qg.p;
import qg.x;

/* loaded from: classes2.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (File file : fileArrListFiles) {
                    if (t.p(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) throws GeneralSecurityException, IOException {
        jh.c cVar = new jh.c('A', 'z');
        ArrayList arrayList = new ArrayList(p.h(cVar, 10));
        Iterator<Character> it = cVar.iterator();
        while (((jh.b) it).f15740c) {
            arrayList.add(Character.valueOf(((jh.b) it).c()));
        }
        List listF0 = x.f0(arrayList);
        Collections.shuffle(listF0);
        String strI = x.I(((ArrayList) listF0).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strI)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i10];
                    if (r.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i10++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
