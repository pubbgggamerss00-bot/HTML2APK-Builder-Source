package com.android.apksig.internal.apk;

import com.android.apksig.ApkVerificationIssue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ApkSigResult {
    public final int signatureSchemeVersion;
    public boolean verified;
    public final List<ApkSignerInfo> mSigners = new ArrayList();
    private final List<ApkVerificationIssue> mWarnings = new ArrayList();
    private final List<ApkVerificationIssue> mErrors = new ArrayList();

    public ApkSigResult(int i10) {
        this.signatureSchemeVersion = i10;
    }

    public void addError(int i10, Object... objArr) {
        this.mErrors.add(new ApkVerificationIssue(i10, objArr));
    }

    public void addWarning(int i10, Object... objArr) {
        this.mWarnings.add(new ApkVerificationIssue(i10, objArr));
    }

    public boolean containsErrors() {
        if (!this.mErrors.isEmpty()) {
            return true;
        }
        if (this.mSigners.isEmpty()) {
            return false;
        }
        Iterator<ApkSignerInfo> it = this.mSigners.iterator();
        while (it.hasNext()) {
            if (it.next().containsErrors()) {
                return true;
            }
        }
        return false;
    }

    public boolean containsWarnings() {
        if (!this.mWarnings.isEmpty()) {
            return true;
        }
        if (this.mSigners.isEmpty()) {
            return false;
        }
        Iterator<ApkSignerInfo> it = this.mSigners.iterator();
        while (it.hasNext()) {
            if (it.next().containsWarnings()) {
                return true;
            }
        }
        return false;
    }

    public List<? extends ApkVerificationIssue> getErrors() {
        return this.mErrors;
    }

    public List<? extends ApkVerificationIssue> getWarnings() {
        return this.mWarnings;
    }
}
