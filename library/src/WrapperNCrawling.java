import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class FoodHouse{
	private int rank;
	private double score;
	private String name,addr,review;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
}
/*
 * <figcaption>
                      <div class="info">
                        <div class="wannago_wrap">
                          <button class="btn-type-icon favorite wannago_btn "
                                  data-restaurant_uuid="13357"
                                  data-action_id="">
                          </button>
                          <p class="wannago_txt">가고싶다 </p>
                        </div>
                        <span class="title ">
                          <a href="/restaurants/aeO_cG35KO"
                             onclick="trackEvent('CLICK_RESTAURANT', {&quot;position&quot;:0,&quot;restaurant_key&quot;:&quot;aeO_cG35KO&quot;})">
                            1.<h3> 패스트리부티크</h3>
                          </a>
                        </span>
                        <strong class="point  ">
                          <span>4.7</span>
                        </strong>
                        <p class="etc ">서울특별시 중구 동호로 249 서울신라호텔 1F</p>
                      </div>
                    </figcaption>
                  </figure>

                    <div class="review-content no-bottom">
                      <figure class="user">
                        <div class="thumb lazy"
                             data-original="https://s3-ap-northeast-1.amazonaws.com/img.prod.mp/9239_1447128966860?fit=around|56:56&amp;crop=56:56;*,*&amp;output-format=jpg&amp;output-quality=80"
                             data-error="https://mp-seoul-image-production-s3.mangoplate.com/web/resources/jmcmlp180qwkp1jj.png?fit=around|*:*&amp;crop=*:*;*,*&amp;output-format=jpg&amp;output-quality=80">
                        </div>
                        <figcaption class="">
                          영구빵
                        </figcaption>
                      </figure>
                      <p class="short_review " onclick="trackEvent('CLICK_FEATURED_REVIEW')" data-restaurant_key="aeO_cG35KO" data-is_long_reivew="
                        true
                        ">
                          저 영롱한 단면이 보이시나영.. 위에 있는 망고도 황홀한데 케이쿠 사이사이에도 저렇게 망고가 많답니당ㅠㅠ 작년에 먹고 싶었는데 시즌을 놓쳐가지고...
                      </p>

                      <p class="long_review ">
                        저 영롱한 단면이 보이시나영.. 위에 있는 망고도 황홀한데 케이쿠 사이사이에도 저렇게 망고가 많답니당ㅠㅠ 작년에 먹고 싶었는데 시즌을 놓쳐가지고 못 먹었다는 슬픈 사연.. 올해는 잊지 않고 제때 찾아갔습니다요ㅎㅎㅎ 그래도 케익보다는 빙수가 더 맛있다는 얘기가 많아서 조금 덜 기대를 해서 그런감.. 존맛탱구리!!!!!!!!!!! 케익에 이렇게 고퀄 망고가 올라가는게 말이 됩니까ㅠㅠ
                      </p>

                        <span class="review_more_btn" onclick="trackEvent('CLICK_MORE_REVIEW', {&quot;position&quot;:0,&quot;restaurant_key&quot;:&quot;aeO_cG35KO&quot;})">더보기</span>
                    </div>
 */
public class WrapperNCrawling {
	public static void main(String[] args) {
		FoodHouse[] fh = new FoodHouse[10];
		try {
			Document doc = Jsoup.connect("https://www.mangoplate.com/top_lists/2849_fruitdessert").get();
			//HTML 태그 == 자바 Element
			Elements span = doc.select("span.title");
			Elements strong = doc.select("strong.point");
			Elements addr = doc.select("p.etc");
			Elements review = doc.select("p.long_review");
			for(int i=0;i<10;i++) {
				String etc = span.get(i).text();
				String rank = etc.substring(0,etc.indexOf("."));
				int rk = Integer.parseInt(rank);
				System.out.println(rk);
				String name = etc.substring(etc.indexOf(".")+1).trim();
				System.out.println(name);
				double score = Double.parseDouble(strong.get(i).text().trim());
				System.out.println(score);
				String adr = addr.get(i).text();
				System.out.println(adr);
				String rv = review.get(i).text();
				System.out.println(rv);
				System.out.println("=====================================");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
