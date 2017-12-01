package zhanghegang.com.bawei.onetime;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import zhanghegang.com.bawei.onetime.base.BaseActivity;
import zhanghegang.com.bawei.onetime.base.BasePresenter;

public class ForgetPassActivity extends BaseActivity {

    @BindView(R.id.tv_forget_back)
    ImageView tvForgetBack;
    @BindView(R.id.tv_forget_hava)
    TextView tvForgetHava;
    @BindView(R.id.iv_other_middle)
    ImageView ivOtherMiddle;
    @BindView(R.id.et_forgert_phone)
    EditText etForgertPhone;
    @BindView(R.id.tv_gainVercode)
    TextView tvGainVercode;
    @BindView(R.id.et_pass)
    EditText etPass;
    @BindView(R.id.ll_edit)
    LinearLayout llEdit;
    @BindView(R.id.btn_foget_next)
    Button btnFogetNext;
    @BindView(R.id.tv_auto_reg)
    TextView tvAutoReg;

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_forget_pass;
    }

    @Override
    public void initView() {
        setStatus(true);

    }

    @Override
    public void ionDestroy() {

    }




    @OnClick({R.id.tv_forget_back, R.id.tv_forget_hava, R.id.tv_gainVercode, R.id.btn_foget_next, R.id.tv_auto_reg})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_forget_back:
                finish();
                break;
            case R.id.tv_forget_hava:
              start(RegActivity.class,true);
                break;
            case R.id.tv_gainVercode:
                gainVercode();
                break;
            case R.id.btn_foget_next:

                break;
            case R.id.tv_auto_reg:
                start(MainActivity.class,true);
                break;
        }
    }

    private void gainVercode() {
        String phone = etForgertPhone.getText().toString().trim();

    }
}
