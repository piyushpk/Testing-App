package com.examapplication.ui.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v4.app.Fragment;

public class ParentFragment extends Fragment
{
    private ProgressDialog mProgressDialog;
    // dismiss loading fragment_filter_dialog
    protected void dismissLoadingDialog()
    {
        if (mProgressDialog != null && mProgressDialog.isShowing())
        {
            try
            {
                mProgressDialog.dismiss();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

    // show loading fragment_filter_dialog
    protected void showLoadingDialog(Context context)
    {
        mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setMessage("Please wait...");
        mProgressDialog.setCancelable(false);
        mProgressDialog.setCanceledOnTouchOutside(false);
        mProgressDialog.show();

    }

    // show loading fragment_filter_dialog
    protected void showLoadingDialog(String msg,Context context)
    {
        mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setMessage(msg);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setCanceledOnTouchOutside(false);
        mProgressDialog.show();
    }

    @Override
    public void onStart()
    {
        super.onStart();
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }
}
