package com.google.android.recaptcha;

import kotlin.jvm.internal.j;

/* loaded from: classes2.dex */
public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i10, j jVar) {
        this(recaptchaErrorCode, (i10 & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }
}
