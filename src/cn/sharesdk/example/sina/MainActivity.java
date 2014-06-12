package cn.sharesdk.example.sina;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.utils.UIHandler;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.sina.weibo.SinaWeibo;


/** 中文注释
 * ShareSDK 官网地址 ： http://www.sharesdk.cn </br>
 *1、这是用2.11版本的sharesdk，一定注意  </br>
 *2、如果要咨询客服，请加企业QQ 4006852216 </br>
 *3、咨询客服时，请把问题描述清楚，最好附带错误信息截图 </br>
 *4、一般问题，集成文档中都有，请先看看集成文档；减少客服压力，多谢合作  ^_^</br></br></br>
 *
 *The password of demokey.keystore is 123456
 **ShareSDK Official Website ： http://www.sharesdk.cn </br>
 *1、Be carefully, this sample use the version of 2.11 sharesdk  </br>
 *2、If you want to ask for help，please add our QQ whose number is 4006852216 </br>
 *3、Please describe detail of the question , if you have the picture of the bugs or the bugs' log ,that is better </br>
 *4、Usually, the answers of some normal questions is exist in our user guard pdf, please read it more carefully,thanks  ^_^
*/
@SuppressLint("NewApi")
public class MainActivity extends Activity {

	private static final int MSG_TOAST = 1;
	private static final int MSG_ACTION_CCALLBACK = 2;
	private static final int MSG_CANCEL_NOTIFY = 3;

	private static final String FILE_NAME = "/share_pic.jpg";
	public static String TEST_IMAGE;
	
	/**ShareSDK集成方法有两种</br>
	 * 1、第一种是引用方式，例如引用OneKeyShare项目，OneKeyShare项目在引用mainlibs库</br>
	 * 2、第二种是把onekeyshare和mainlibs集成到项目中，本例子就是用第二种方式</br>
	 * 请看“ShareSDK 使用说明文档”，SDK下载目录中 </br>
	 * 或者看网络集成文档 http://wiki.sharesdk.cn/Android_%E5%BF%AB%E9%80%9F%E9%9B%86%E6%88%90%E6%8C%87%E5%8D%97
	 * 3、混淆时，把sample或者本例子的混淆代码copy过去，在proguard-project.txt文件中
	 * 
	 * 平台配置信息有三种方式：
	 * 1、在我们后台配置各个微博平台的key
	 * 2、在代码中配置各个微博平台的key，http://sharesdk.cn/androidDoc/cn/sharesdk/framework/ShareSDK.html
	 * 3、在配置文件中配置，本例子里面的assets/ShareSDK.xml,
	 *
	 *
	 * There are two function to integrate ShareSDK 
	 * 1、First, your project add the library of OneKeyShare, and the OneKeyShare library add the library of ShareSDK
	 * 2、Second, putting all the source of ShareSDK and Onekeyshare into your project, which don't add library
	 * 3、If you want to obfuscate project, you can reference this sample’s proguard-project file
	 *
	 * There are three function to configure Weibo APP KEY
	 * 1、 Configuring each keys of microblogging platform in our background
	 * 2、Configuring each keys of microblogging platform in your code
	 * 3、Configuring each keys of microblogging platform in your project of assets/ShareSDK.xml file
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		getRttTime("182.254.98.149",80);
		getRttTime("101.227.130.26",80);
		getRttTime("101.226.103.79",80);
		getRttTime("202.55.10.165",80);
		
		
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ShareSDK.stopSDK(this);
	}

	

	private long getRttTime(String ip,int port)
	{
		
		System.out.println("start connect ");
		  long k=0,begin,end,time;
		  Date mydate=new Date();
		  begin=mydate.getTime();
        // 连接服务器
        try {
			Socket _socket = new Socket(ip,port);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        Date mydate2=new Date();
        end=mydate2.getTime();
        time=end-begin;
		return time;
	}
	
	
}
